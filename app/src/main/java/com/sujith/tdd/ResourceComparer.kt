package com.sujith.tdd

import android.content.Context

class ResourceComparer {
     fun isResourceSameAsString(ctx: Context, resId: Int, str: String): Boolean {
        return ctx.getString(resId) == str
    }
}