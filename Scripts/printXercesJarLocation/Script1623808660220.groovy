import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl

URL u = DocumentBuilderFactoryImpl.class.getResource("/" + DocumentBuilderFactoryImpl.class.getName().replaceAll("\\.", "/") + ".class");

System.out.println(u);

/**
 * I got
 * jar:file:/Applications/Katalon%20Studio.app/Contents/Eclipse/plugins/org.codehaus.groovy_2.4.20.v202009301404-e2006-RELEASE/lib/org.apache.xerces.impl_2.11.0.jar!/org/apache/xerces/jaxp/DocumentBuilderFactoryImpl.class
 */