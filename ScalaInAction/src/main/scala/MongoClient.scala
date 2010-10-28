// package com.scalainaction.mongo

import com.mongodb.Mongo

class MongoClient(val host:String, val port:Int) { 
	require(host != null, "You have to provide a host name")
	require(port != null, "You have to provide a port")
	
	private val underlying = new Mongo(host, port) 

	def this() = this("127.0.0.1", 27017)
	
	def myhost() = host
}