package com.cedexis.qa

import net.sf.json.JSONArray
import org.testng.annotations.*
import groovyx.net.http.ContentEncoding
import groovyx.net.http.HTTPBuilder
import groovy.util.logging.Log4j

/**
 * Created by hieberts on 12/22/14.
 */
class DnsHostTest {

    @DataProvider(name = "hostsAndServices")
    Object[][] hostsAndServices() { [
        ["testhost", ""]
    ] }

    @Test
    testVerifyLookup(String queryHost, String serviceHost) {
        def httpBuilder = new HTTPBuilder()

        http.request(, GET, JSON) {
            uri.path = "/apps"

            response.failure = { resp ->
                assert false
            }

            response.success = { resp, json ->
                assert resp.statusLine.statusCode == HttpStatus.SC_OK
            }
        }
    }

    def makeAppsRequest(String queryHost, Closure callback) {
        def httpBuilder = new HTTPBuilder("http://${queryHost}", JSONArray)
    }

    makeDnsLookup(String serviceHost, Closure callback) {

    }
}
