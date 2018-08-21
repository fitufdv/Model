package com.example.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Car {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
    @ColumnInfo
    var title: String? = null
    @ColumnInfo
    var description: String? = null

    companion object {
        fun builder(): Builder {
            return Builder()
        }
    }

    constructor(id: Int?, title: String?, description: String?) {
        this.id = id
        this.title = title
        this.description = description
    }

    private constructor(builder: Builder) {
        this.id = builder.id
        this.title = builder.title
        this.description = builder.description
    }

    class Builder {
        internal var id: Int? = null
        internal var title: String? = null
        internal var description: String? = null

        fun id(`val`: Int?): Builder {
            id = `val`
            return this
        }

        fun title(`val`: String?): Builder {
            title = `val`
            return this
        }

        fun description(`val`: String?): Builder {
            description = `val`
            return this
        }

        fun build(): Car {
            return Car(this)
        }
    }
}