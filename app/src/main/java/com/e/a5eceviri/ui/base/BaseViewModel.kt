package com.e.a5eceviri.ui.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    protected abstract fun init()
}