package com.ieti.taskapp.modules;

@Module
@InstallIn(SingletonComponent.class)
public class AnalyticsModule {
    @Provides
    public AnalyticsService provideAnalyticsService() {
        return GoogleAnalyticsService();
    }
}