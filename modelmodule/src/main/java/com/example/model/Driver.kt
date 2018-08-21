package com.example.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Driver {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
    @ColumnInfo
    var name: String? = null
    @ColumnInfo
    var age: Int? = null

    companion object {
        fun builder(): Builder {
            return Builder()
        }
    }

    constructor(id: Int?, name: String?, age: Int?) {
        this.id = id
        this.name = name
        this.age = age
    }

    private constructor(builder: Builder) {
        this.id = builder.id
        this.name = builder.name
        this.age = builder.age
    }

    class Builder {
        internal var id: Int? = null
        internal var name: String? = null
        internal var age: Int? = null

        fun id(`val`: Int?): Builder {
            id = `val`
            return this
        }

        fun title(`val`: String?): Builder {
            name = `val`
            return this
        }

        fun age(`val`: Int?): Builder {
            age = `val`
            return this
        }

        fun build(): Driver {
            return Driver(this)
        }
    }
}
