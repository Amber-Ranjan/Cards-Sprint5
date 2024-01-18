<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>UAT - Add Currency (G1A00011)</name>
   <tag></tag>
   <elementGuidId>87e965cd-bdb5-4140-aa3a-f56627c79435</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\r\n{\r\n    \&quot;msgHeader\&quot;:{\r\n        \&quot;msgRefNo\&quot;:\&quot;123456\&quot;,\r\n        \&quot;requesterId\&quot;:\&quot;00146222\&quot;,\r\n        \&quot;staffPfId\&quot;:\&quot;00146222\&quot;,\r\n        \&quot;transDateTime\&quot;:\&quot;\&quot;,\r\n        \&quot;branchCode\&quot;:\&quot;14011\&quot;,\r\n        \&quot;consumerEnv\&quot;:\&quot;SIT\&quot;,\r\n        \&quot;transCode\&quot;:\&quot;G1A00011\&quot;\r\n    },\r\n    \&quot;msgBody\&quot;: {\r\n        \&quot;accountNumber\&quot;: \&quot;900000000025\&quot;,\r\n        \&quot;currencyCode\&quot;: \&quot;EUR\&quot;\r\n    }\r\n}&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJNQUUiLCJhcHAiOiJNQUUiLCJjdHkiOiJNWVMiLCJpc3MiOiJvcGVuc3lzdGVtcyIsImlhdCI6MTY4OTU1MTU2MSwiZXhwIjozMzI0NjQzMjAwMH0.DvlcpRVheEVp9Tx-trY6ejkljsQ9niK0y0Jg7lRpx9IuFqQCkEKwYTJeWHxJcl_b</value>
      <webElementGuid>711be215-5f54-4b0f-8218-d4ff382d4aba</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Country-Code</name>
      <type>Main</type>
      <value>MYS</value>
      <webElementGuid>bbf8e3f7-2f68-4786-93d8-3cabf1e82fc1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Channel-Id</name>
      <type>Main</type>
      <value>MAE</value>
      <webElementGuid>0f111040-33c2-47bc-bef9-3b6f41a2a8ac</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://172.31.182.116:8090/account</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
