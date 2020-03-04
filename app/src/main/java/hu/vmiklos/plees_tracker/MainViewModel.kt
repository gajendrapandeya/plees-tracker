/*
 * Copyright 2020 Miklos Vajna. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the LICENSE file.
 */

package hu.vmiklos.plees_tracker

import android.content.ContentResolver
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

/**
 * This is the view model of MainActivity, providing coroutine scopes.
 */
class MainViewModel : ViewModel() {
    fun stopSleep() {
        viewModelScope.launch {
            DataModel.storeSleep()
        }
    }

    fun exportData(cr: ContentResolver, uri: Uri) {
        viewModelScope.launch {
            DataModel.exportData(cr, uri)
        }
    }

    fun importData(cr: ContentResolver, uri: Uri) {
        viewModelScope.launch {
            DataModel.importData(cr, uri)
        }
    }

    fun insertSleep(sleep: Sleep) {
        viewModelScope.launch {
            DataModel.insertSleep(sleep)
        }
    }

    fun deleteSleep(sleep: Sleep) {
        viewModelScope.launch {
            DataModel.deleteSleep(sleep)
        }
    }
}

/* vim:set shiftwidth=4 softtabstop=4 expandtab: */
