package com.example.catbrowser.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

// converting JSON into object
@JsonClass(generateAdapter = true)
data class Breed (
    val weight: Weight,
    val id: String?,
    val name: String?,
    val cfa_url: String?,
    @Json(name = "vetstreet_url") val vetstreetUrl: String?,
    @Json(name = "vcahospitals_url") val vcahospitalsUrl: String?,
    val temperament: String?,
    val origin: String?,
    @Json(name = "country_codes")val countryCodes: String?,
    @Json(name = "country_code")val countryCode: String?,
    val description: String?,
    @Json(name = "life_span")val lifeSpan: String?,
    val indoor: Int?,
    val lap: Int??,
    @Json(name = "alt_names")val altNames: String?,
    val adaptability: Int?,
    @Json(name = "affection_level")val affectionLevel: Int?,
    @Json(name = "child_friendly")val childFriendly: Int?,
    @Json(name = "dog_friendly")val dogFriendly: Int?,
    @Json(name = "energy_level")val energyLevel: Int?,
    val grooming: Int?,
    @Json(name = "health_issues") val healthIssues: Int?,
    val intelligence: Int?,
    @Json(name = "shedding_level") val sheddingLevel: Int?,
    val social_needs: Int?,
    @Json(name = "stranger_friendly") val strangerFriendly: Int?,
    val vocalisation: Int?,
    val experimental: Int?,
    val hairless: Int?,
    val natural: Int?,
    val rare: Int?,
    val rex: Int?,
    @Json(name = "suppressed_tail") val suppressedTail: Int?,
    @Json(name = "short_legs") val shortLegs: Int?,
    @Json(name = "wikipedia_url")val wikipediaUrl: String?,
    val hypoallergenic: Int?,
    @Json(name = "reference_image_id")val referenceImageId: String?,
    val image: Image?
)
@JsonClass(generateAdapter = true)
data class Weight (
    val imperial: String?,
    val metric: String?,
)
@JsonClass(generateAdapter = true)
data class Image (
    val id: String?,
    val width: Int?,
    val height: Int?,
    val url: String?,
)
