package com.bb.bigbrotheruser.base.callback

interface AlertDialogCallback {

    fun onPositiveButton(dialogId: Int)

    fun onNegativeButton(dialogId: Int)
}