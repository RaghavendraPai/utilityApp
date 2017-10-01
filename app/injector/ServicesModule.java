package injector;

import com.google.inject.AbstractModule;
import play.Logger;
import services.UtilityService;
import services.impl.UtilityServiceImpl;

public class ServicesModule extends AbstractModule {

  @Override
  protected void configure() {
    bindService();
  }

  private void bindService() {
    Logger.info("Binding service ...");
    bind(UtilityService.class).to(UtilityServiceImpl.class);
  }

}
