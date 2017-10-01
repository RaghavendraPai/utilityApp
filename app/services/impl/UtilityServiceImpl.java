package services.impl;

import services.UtilityService;

import java.util.Arrays;
import java.util.List;

public class UtilityServiceImpl implements UtilityService {

  @Override
  public Integer fetchCommaSeparatedCount(String commaString) {
    return Arrays.asList(commaString.split(",")).size();
  }

}
