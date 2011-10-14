package br.com.gfuture.grails.full.example

class User {

	@org.grails.solr.Solr(field="name")
	String name
	
	@org.grails.solr.Solr(field="name")
	Date createdAt

	static mapWith = "mongo"
	static enableSolrSearch = true
	
	static constraints = {
	}
	
}