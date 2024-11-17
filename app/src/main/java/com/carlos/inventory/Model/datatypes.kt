package com.carlos.inventory.Model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "inventory")
data class Inventory(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0, // Primary Key, Auto-generated

    @ColumnInfo(name = "name")
    val name: String, // Required

    @ColumnInfo(name = "quantity")
    val quantity: Int, // Numeric

    @ColumnInfo(name = "supplier", defaultValue = "Co-op Store")
    val supplier: String = "Co-op Store", // Default value is "Co-op Store"

    @ColumnInfo(name = "cost_per_unit")
    val costPerUnit: Double // Numeric
)