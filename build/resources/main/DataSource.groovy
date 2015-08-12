/**
 * Created by qianminming on 12/08/15.
 */
dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    dbCreate = "create-drop"
    url = "jdbc:mysql://localhost/grails?useUnicode=yes&characterEncoding=UTF-8"
    username = "root"
    password = "root"
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/grails?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "root"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/grails?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "root"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/grails?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "root"
        }
    }
}