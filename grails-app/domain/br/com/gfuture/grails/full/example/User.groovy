package br.com.gfuture.grails.full.example

class User {

	String name
	Date createdAt

	static mapWith = "mongo"

	static constraints = {
	}
	
}