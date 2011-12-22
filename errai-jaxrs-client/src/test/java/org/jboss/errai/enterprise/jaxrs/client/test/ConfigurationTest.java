/*
 * Copyright 2011 JBoss, a division of Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.enterprise.jaxrs.client.test;

import org.jboss.errai.enterprise.client.jaxrs.api.RestClient;
import org.jboss.errai.enterprise.client.jaxrs.test.AbstractErraiJaxrsTest;
import org.junit.Test;

/**
 * Tests configuration settings.
 * 
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public class ConfigurationTest extends AbstractErraiJaxrsTest {

  @Override
  public String getModuleName() {
    return "org.jboss.errai.enterprise.jaxrs.TestModule";
  }

  @Override
  protected void gwtSetUp() throws Exception {
    super.gwtSetUp();
  }

  @Test
  public void testNullApplicationRoot() {
    RestClient.setJaxRsApplicationRoot(null);
    assertEquals("", RestClient.getJaxRsApplicationRoot());
  }

  @Test
  public void testEmptyApplicationRoot() {
    RestClient.setJaxRsApplicationRoot("");
    assertEquals("", RestClient.getJaxRsApplicationRoot());
  }

  @Test
  public void testApplicationRootWithMissingSlash() {
    RestClient.setJaxRsApplicationRoot("/root");
    assertEquals("/root/", RestClient.getJaxRsApplicationRoot());
  }

  @Test
  public void testApplicationRoot() {
    RestClient.setJaxRsApplicationRoot("http://localhost:8080/root/");
    assertEquals("http://localhost:8080/root/", RestClient.getJaxRsApplicationRoot());
  }
}
