package org.kamiblue.commons.collections

import org.kamiblue.commons.interfaces.Alias

class AliasSet<T : Alias> : NameableSet<T>() {

    override fun add(element: T): Boolean {
        var modified = super.add(element)
        element.alias.forEach { alias ->
            val prevValue = map.put(alias.toLowerCase(), element)
            prevValue?.let { remove(it) }
            modified = prevValue == null || modified
        }
        return modified
    }

    override fun remove(element: T): Boolean {
        var modified = super.remove(element)
        element.alias.forEach {
            modified = map.remove(it.toLowerCase()) != null || modified
        }
        return modified
    }

}