package org.kamiblue.commons.extension


fun CharSequence.replaceAll(replacement: String, vararg regexes: Regex): CharSequence {
    regexes.forEach {
        if (it.matches(this)) {
            return this.replace(it, replacement)
        }
    }

    return this
}