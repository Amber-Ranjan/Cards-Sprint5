<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>UAT - Remove Currency (G1A00012)</name>
   <tag></tag>
   <elementGuidId>568d8794-116c-44d1-b007-fc09f7cbd685</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\r\n    \&quot;msgHeader\&quot;:{\r\n        \&quot;msgRefNo\&quot;:\&quot;123456\&quot;,\r\n        \&quot;requesterId\&quot;:\&quot;00146222\&quot;,\r\n        \&quot;staffPfId\&quot;:\&quot;00146222\&quot;,\r\n        \&quot;transDateTime\&quot;:\&quot;\&quot;,\r\n        \&quot;branchCode\&quot;:\&quot;14011\&quot;,\r\n        \&quot;consumerEnv\&quot;:\&quot;SIT\&quot;,\r\n        \&quot;transCode\&quot;:\&quot;G1A00012\&quot;\r\n    },\r\n    \&quot;msgBody\&quot;: {\r\n        \&quot;accountNumber\&quot;: \&quot;900000000025\&quot;,\r\n        \&quot;currencyCode\&quot;: \&quot;EUR\&quot;\r\n    }\r\n}\r\n&quot;,
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
      <webElementGuid>4a22d99c-26e6-46b7-86b8-0457a44241b7</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Country-Code</name>
      <type>Main</type>
      <value>MYS</value>
      <webElementGuid>23c33c42-c815-407f-b122-a276566685b5</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Channel-Id</name>
      <type>Main</type>
      <value>MAE</value>
      <webElementGuid>545f6a16-c086-40ad-8e71-33900f68af0d</webElementGuid>
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
