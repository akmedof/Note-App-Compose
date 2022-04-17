package com.aslan.notecompose.di

import android.content.Context
import androidx.room.Room
import com.aslan.notecompose.data.NoteDatabase
import com.aslan.notecompose.data.model.Note
import com.aslan.notecompose.util.Constants.DATABASE_NAME
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: NoteDatabase) = database.noteDao()

}