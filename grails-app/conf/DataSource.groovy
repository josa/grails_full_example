mongo {
	host = "localhost"
	port = 27107
	//username = "blah"
	//password = "blah"
	databaseName = "grails_full_example"
	options {
		autoConnectRetry = true
		connectTimeout = 300
	}
}

dataSource {
	pooled = true
	driverClassName = "org.h2.Driver"
	username = "sa"
	password = ""
}


hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:h2:mem:devDb"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:h2:mem:testDb"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:h2:prodDb"
			// For MySQL production scenarios enable the following settings
			//          pooled = true
			//          properties {
			//               minEvictableIdleTimeMillis=1800000
			//               timeBetweenEvictionRunsMillis=1800000
			//               numTestsPerEvictionRun=3
			//               testOnBorrow=true
			//               testWhileIdle=true
			//               testOnReturn=true
			//               validationQuery="SELECT 1"
			//          }
		}
	}
}
