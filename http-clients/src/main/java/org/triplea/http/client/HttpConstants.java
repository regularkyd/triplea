package org.triplea.http.client;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Utility class with constants for HTTP clients.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class HttpConstants {
  public static final String ACCEPT_JSON = "Accept: application/json";
  public static final String ACCEPT_TEXT = "Accept: text/plain";
  public static final String CONTENT_TYPE_JSON = "Content-Type: application/json";
  public static final String CONTENT_TYPE_TEXT = "Content-Type: text/plain";
  public static final String APPLICATION_FORM_URLENCODED = "Content-Type: application/x-www-form-urlencoded";
}