<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>UAT - Remove Currency (G1A00012)</name>
   <tag></tag>
   <elementGuidId>3b95b605-87bc-48e5-b9f7-d7854e68ea7b</elementGuidId>
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
      <webElementGuid>062c3197-1ca5-4241-afb7-21beda9ae615</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Country-Code</name>
      <type>Main</type>
      <value>MYS</value>
      <webElementGuid>01220fd5-4fa4-409c-8045-a7a7d0780613</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Channel-Id</name>
      <type>Main</type>
      <value>MAE</value>
      <webElementGuid>84531254-4708-4c4e-8de3-0791df440343</webElementGuid>
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
