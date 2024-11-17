package com.carlos.inventory.Controllers

import androidx.room.Query

@InventoryDao.queries
interface InventoryDao {
    annotation class queries

    // Query to calculate the total monetary worth of inventory
    @Query("SELECT SUM(quantity * cost_per_unit) FROM inventory")
    suspend fun getTotalMonetaryWorth(): Double
}
