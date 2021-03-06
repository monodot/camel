/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ddb;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Ddb2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws2.ddb.Ddb2Configuration getOrCreateConfiguration(Ddb2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.ddb.Ddb2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Ddb2Component target = (Ddb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonddbclient":
        case "amazonDDBClient": getOrCreateConfiguration(target).setAmazonDDBClient(property(camelContext, software.amazon.awssdk.services.dynamodb.DynamoDbClient.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.ddb.Ddb2Configuration.class, value)); return true;
        case "consistentread":
        case "consistentRead": getOrCreateConfiguration(target).setConsistentRead(property(camelContext, boolean.class, value)); return true;
        case "keyattributename":
        case "keyAttributeName": getOrCreateConfiguration(target).setKeyAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "keyattributetype":
        case "keyAttributeType": getOrCreateConfiguration(target).setKeyAttributeType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws2.ddb.Ddb2Operations.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "readcapacity":
        case "readCapacity": getOrCreateConfiguration(target).setReadCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "writecapacity":
        case "writeCapacity": getOrCreateConfiguration(target).setWriteCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("accessKey", java.lang.String.class);
        answer.put("amazonDDBClient", software.amazon.awssdk.services.dynamodb.DynamoDbClient.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("configuration", org.apache.camel.component.aws2.ddb.Ddb2Configuration.class);
        answer.put("consistentRead", boolean.class);
        answer.put("keyAttributeName", java.lang.String.class);
        answer.put("keyAttributeType", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("operation", org.apache.camel.component.aws2.ddb.Ddb2Operations.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        answer.put("readCapacity", java.lang.Long.class);
        answer.put("region", java.lang.String.class);
        answer.put("secretKey", java.lang.String.class);
        answer.put("trustAllCertificates", boolean.class);
        answer.put("writeCapacity", java.lang.Long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Ddb2Component target = (Ddb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonddbclient":
        case "amazonDDBClient": return getOrCreateConfiguration(target).getAmazonDDBClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "consistentread":
        case "consistentRead": return getOrCreateConfiguration(target).isConsistentRead();
        case "keyattributename":
        case "keyAttributeName": return getOrCreateConfiguration(target).getKeyAttributeName();
        case "keyattributetype":
        case "keyAttributeType": return getOrCreateConfiguration(target).getKeyAttributeType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "readcapacity":
        case "readCapacity": return getOrCreateConfiguration(target).getReadCapacity();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        case "writecapacity":
        case "writeCapacity": return getOrCreateConfiguration(target).getWriteCapacity();
        default: return null;
        }
    }
}

