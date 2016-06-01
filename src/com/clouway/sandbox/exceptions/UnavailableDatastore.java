package com.clouway.sandbox.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * A Testing datastore which fails when keys are going to be retrieved.
 *
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public class UnavailableDatastore implements Datastore {

  public List<String> keys() {
    // Uncomment following line to verify that UnavailableDatastoreTest will pass
    //throw new IllegalStateException("Datastore is temporary unavailable.");
    return new ArrayList<String>();
  }
}
