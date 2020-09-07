

var ttrApp = angular.module('ttrApp', ['ngRoute']);
ttrApp.config(function($routeProvider){
	$routeProvider
	.when('/ttr', { controller: 'ttrCtrl', templateUrl: 'pages/ttr.html'})
	.when('/dq', { controller: 'ttrCtrl', templateUrl: 'pages/dq.html'})
	.when('/twitter', { controller: 'ttrCtrl', templateUrl: 'pages/twitter.html'})
	.otherwise( { redirectTo: '/' } );
});

ttrApp.controller('ttrCtrl', function($scope,$http,$window) {
	//$scope.dataLoading = true;
	/*setInterval(function () {		
		if(new Date().getDate()==15){
			document.getElementById("closedBugs").classList.add('test');
		}			
	}, 1000);*/
	$scope.message="..........It is under progress......";
	$scope.page="home";
	/*$scope.firstName = "testing";
	$scope.lastName = "ttr";*/
	$scope.ttrId="";
	$scope.checkCondition=function(data,a,b){
		return (data>=a && data<b);
	}
	$scope.checkOrder=function(a,b,c){
		return (a==b&&c);
	}
	$scope.home=function(){
		$scope.page="home";
	}
	/*angular.element($window).bind("scroll", function() {
		var windowHeight = "innerHeight" in window ? window.innerHeight : document.documentElement.offsetHeight;
		var body = document.body, html = document.documentElement;
		var docHeight = Math.max(body.scrollHeight, body.offsetHeight, html.clientHeight,  html.scrollHeight, html.offsetHeight);
		windowBottom = windowHeight + window.pageYOffset;
		if (windowBottom >= docHeight) {
			$scope.limit=$scope.output.length;
		}
	});*/
	$scope.raisettr=function(user,err){		
		if(err==''){return;}
		$http.get('/raiseTTR',{params:{agent:user,error:err}})
		.success(function(data){
			$scope.ttrId=data;
			$scope.dataLoading = false;
		})
		.error(function (data) {
			$scope.ttr="An error occurred during the AJAX request";
		});		
	}
	$scope.showConfirm = function() {
		alert();
		/*var confirm = $mdDialog.confirm()
		.title('Are you sure to delete the record?')
		.textContent('Record will be deleted permanently.')
		.ariaLabel('TutorialsPoint.com')
		.targetEvent(event)
		.ok('Yes')
		.cancel('No');
		$mdDialog.show(confirm).then(function() {
			$scope.status = 'Record deleted successfully!';
		}, function() {
			$scope.status = 'You decided to keep your record.';
		});*/
	};
	/*$scope.open = function() {
//		ngDialog.open("this is test");
		$scope.showModal = true;
	};

	$scope.ok = function() {
		$scope.showModal = false;
	};

	$scope.cancel = function() {
		$scope.showModal = false;
	};*/
	$scope.refreshStats= function(hrs){
		$scope.page="blk";
		$scope.ttrId="";
		$scope.dataLoading = true;
		$http.get('/refreshStats',{params:{hrs:hrs}})
		.success(function(data){
			$scope.output1=data;
			$scope.lastName = "refreshStats";
			$scope.page="dash";
			$scope.duration=hrs;
			$http.get('/lastRefresh',{params:{hrs:hrs}})
			.success(function(data1){
				$scope.lastrefreshtime=data1;
			});
			$http.get('/ilsRefreshStats',{params:{hrs:hrs}})
			.success(function(ilsData){
				$scope.ilsRefreshData=ilsData;
			}); 
			$scope.dataLoading = false;
		});
	}

	$scope.invoke = function(id){
		if(id=='I18N'){return;}
		$scope.page="blk";
		$scope.ttrId="";
		$scope.dataLoading = true;
		$http.get('/localeStats?locale='+id)
		.success(function(data){
			$scope.output=data;		
			$scope.page="locale";
			$scope.lastName = "TTR1";
			$http.get('/lastRefresh',{params:{hrs:4}})
			.success(function(data1){
				$scope.lastrefreshtime=data1;
			});
			$scope.dataLoading = false;
		})
		.error(function (data) {
			$scope.output="An error occurred during the AJAX request";
		});
	}
	$scope.agentInfo=function(agent){
		$http.get('/agentInfo',{params:{agentName:agent}})
		.success(function(data){
			alert(data);
			$scope.agentInfo=data;
		})
		.error(function (data) {
			$scope.ttr="An error occurred during the AJAX request";
		});
	}
	$scope.displayttr=function(){		
		$scope.output=null;
		$scope.page="other";
	}
	$scope.displaydq=function(){		
		$scope.output=null;
		$scope.page="other";
	}
	$scope.displaytwitter=function(){		
		$scope.output=null;
		$scope.page="other";
	}
	$scope.dashboard=function(day){
		$scope.dataLoading = true;
		$scope.page="other";
		$http.get('/ttr',{params:{day:day}})
		.success(function(data){
			$scope.output=data;	
			$scope.dataLoading = false;
			
		});		
	}
	$scope.hourlyStatsInfo=function(agent){
		if($scope.agentName==agent){return;}
		$scope.hourlyStats=null;
		$scope.agentName=agent;
		$scope.hourlyStatsLoading = true;
		$http.get('/hourlyStats?agentName='+agent)
		.success(function(data){
			$scope.hourlyStats=data;
			$scope.hourlyStatsLoading = false;
		})
		.error(function (data) {
			$scope.ttr="An error occurred during the AJAX request";
		});
	}

});