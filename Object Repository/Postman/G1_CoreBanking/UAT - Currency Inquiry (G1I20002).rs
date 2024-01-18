<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>UAT - Currency Inquiry (G1I20002)</name>
   <tag></tag>
   <elementGuidId>a4026c2d-71c0-45b3-bd06-fb88449df92a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;msgHeader\&quot;: {\r\n        \&quot;msgRefNo\&quot;: \&quot;123456\&quot;,\r\n        \&quot;requesterId\&quot;: \&quot;00146222\&quot;,\r\n        \&quot;staffPfId\&quot;: \&quot;00146222\&quot;,\r\n        \&quot;transDateTime\&quot;: \&quot;20230101-01010112\&quot;,\r\n        \&quot;branchCode\&quot;: \&quot;5555\&quot;,\r\n        \&quot;consumerEnv\&quot;: \&quot;SIT\&quot;,\r\n        \&quot;transCode\&quot;: \&quot;G1I20002\&quot;\r\n    },\r\n    \&quot;msgBody\&quot;: {\r\n        \&quot;accountNumber\&quot;: \&quot;900000000025\&quot;,\r\n        \&quot;currencyCode\&quot;: \&quot;ALL\&quot;\r\n    }\r\n}&quot;,
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
      <webElementGuid>472ed00d-f928-4c29-98d7-984ba81acef2</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Country-Code</name>
      <type>Main</type>
      <value>MYS</value>
      <webElementGuid>df74a9bb-b933-4376-85a0-2ecb1529f46b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Channel-Id</name>
      <type>Main</type>
      <value>MAE</value>
      <webElementGuid>13417581-c173-4d0b-b404-2116d3537dc9</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://172.31.182.116:8090/inquiry</restUrl>
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
