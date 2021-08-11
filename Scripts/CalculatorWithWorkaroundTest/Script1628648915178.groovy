import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// as suggested by @duylong at https://forum.katalon.com/t/simplest-soap-test-doent-work-in-ks-v8-0-x-property-http-javax-xml-xmlconstants-property-accessexternaldtd-is-not-recognized-due-to-accessexternaldtd/55765/5
System.setProperty("javax.xml.parsers.DocumentBuilderFactory",
	"com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl");

ResponseObject response = WS.sendRequest(findTestObject('Calculator'), FailureHandling.CONTINUE_ON_FAILURE)
WS.verifyResponseStatusCode(response, 200)
String xmlString = response.getResponseBodyContent()
println(xmlString)

def dataValue = new XmlSlurper(false, false).parseText(xmlString)

