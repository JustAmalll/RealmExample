package dev.amal.realmexample.models

import io.realm.kotlin.ext.realmSetOf
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.RealmSet
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Teacher: RealmObject {
    @PrimaryKey var _id: ObjectId = ObjectId()
    var address: Address? = null
    var courses: RealmSet<Course> = realmSetOf()
}