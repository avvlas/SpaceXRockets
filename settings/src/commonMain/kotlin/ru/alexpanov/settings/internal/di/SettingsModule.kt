package ru.alexpanov.settings.internal.di

import ru.alexpanov.settings.api.SettingsDependencies
import ru.alexpanov.settings.internal.presentation.SettingsFeature

internal class SettingsModule(dependencies: SettingsDependencies) :
    SettingsDependencies by dependencies {
    fun settingsFeature() = SettingsFeature(settingsRepository)
}