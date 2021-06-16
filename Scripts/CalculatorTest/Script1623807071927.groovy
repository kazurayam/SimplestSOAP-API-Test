import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

ResponseObject response = WS.sendRequest(findTestObject('Calculator'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200)

String xmlString = response.getResponseBodyContent()
println(xmlString)


