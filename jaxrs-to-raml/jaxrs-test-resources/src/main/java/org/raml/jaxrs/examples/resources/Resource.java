/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.examples.resources;

import javax.ws.rs.*;

@Path("/classWithMethods")
public class Resource {

  @Path("/path/to/get/")
  @GET
  @Consumes({"text/xml", "application/*"})
  @Produces("application/xml")
  public String getStuff() {
    return "get";
  }

  @Consumes({"text/xml", "application/*"})
  @POST
  public void postStuff() {

  }

  @Consumes({"text/xml", "application/*"})
  @PUT
  public void putStuff(byte[] bytes) {

  }

  @Path("/head/")
  @HEAD
  public String head() {
    return "head";
  }
}
