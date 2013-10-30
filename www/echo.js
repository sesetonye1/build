var echo = {
	testEcho: function ( str, callback){
		cordova.exec(
		callback,
		function(err){
		callback('Nothing to echo.');
		},
		'Echo',
		'testEcho',
		[str]
		);		
	}
}
module.exports = echo;