package org.imozerov.streetartview;

import org.imozerov.streetartview.ui.catalog.ArtListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by imozerov on 06.02.16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(ArtListFragment fragment);
}
