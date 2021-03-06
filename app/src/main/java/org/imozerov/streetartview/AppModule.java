package org.imozerov.streetartview;

import org.imozerov.streetartview.storage.DataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by imozerov on 06.02.16.
 */
@Module
public class AppModule {
    @Provides
    @Singleton
    public Realm provideRealm() {
        return Realm.getDefaultInstance();
    }

    @Provides
    @Singleton
    public DataSource provideDataSource(Realm realm) {
        return new DataSource(realm);
    }
}
