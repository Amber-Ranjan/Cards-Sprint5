<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>UAT - Currency Inquiry (G1I20002)</name>
   <tag></tag>
   <elementGuidId>1e02fd87-656d-4426-91a3-dcb08e6aed8c</elementGuidId>
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
      <webElementGuid>1dfdedd5-b468-484e-99bc-7d40dda2b46a</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Country-Code</name>
      <type>Main</type>
      <value>MYS</value>
      <webElementGuid>4c143ce6-2c3f-481c-926e-2dd6f07305b3</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Channel-Id</name>
      <type>Main</type>
      <value>MAE</value>
      <webElementGuid>6a679f13-297c-401a-a61c-280d6dde8bc7</webElementGuid>
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
