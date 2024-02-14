package dev.amal.realmexample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.amal.realmexample.models.Address
import dev.amal.realmexample.models.Course
import dev.amal.realmexample.models.Student
import dev.amal.realmexample.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun provideRealm(): Realm = Realm.open(
        configuration = RealmConfiguration.create(
            schema = setOf(
                Address::class,
                Teacher::class,
                Course::class,
                Student::class
            )
        )
    )
}