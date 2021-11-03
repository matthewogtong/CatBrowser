package com.example.catbrowser.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


/**
 * {
"weight": {
"imperial": "7  -  10",
"metric": "3 - 5"
},
"id": "abys",
"name": "Abyssinian",
"cfa_url": "http://cfa.org/Breeds/BreedsAB/Abyssinian.aspx",
"vetstreet_url": "http://www.vetstreet.com/cats/abyssinian",
"vcahospitals_url": "https://vcahospitals.com/know-your-pet/cat-breeds/abyssinian",
"temperament": "Active, Energetic, Independent, Intelligent, Gentle",
"origin": "Egypt",
"country_codes": "EG",
"country_code": "EG",
"description": "The Abyssinian is easy to care for, and a joy to have in your home. They’re affectionate cats and love both people and other animals.",
"life_span": "14 - 15",
"indoor": 0,
"lap": 1,
"alt_names": "",
"adaptability": 5,
"affection_level": 5,
"child_friendly": 3,
"dog_friendly": 4,
"energy_level": 5,
"grooming": 1,
"health_issues": 2,
"intelligence": 5,
"shedding_level": 2,
"social_needs": 5,
"stranger_friendly": 5,
"vocalisation": 1,
"experimental": 0,
"hairless": 0,
"natural": 1,
"rare": 0,
"rex": 0,
"suppressed_tail": 0,
"short_legs": 0,
"wikipedia_url": "https://en.wikipedia.org/wiki/Abyssinian_(cat)",
"hypoallergenic": 0,
"reference_image_id": "0XYvRd7oD",
"image": {
"id": "0XYvRd7oD",
"width": 1204,
"height": 1445,
"url": "https://cdn2.thecatapi.com/images/0XYvRd7oD.jpg"
}
}
 */

// converting JSON into object
@JsonClass(generateAdapter = true)
data class Breed (
    val weight: Weight,
    val id: String,
    val name: String,
    val cfa_url: String,
    @Json(name = "vetstreet_url") val vetstreetUrl: String,
    @Json(name = "vcahospitals_url") val vcahospitalsUrl: String,
    val temperament: String,
    val origin: String,
    @Json(name = "country_codes")val countryCodes: String,
    @Json(name = "country_code")val countryCode: String,
    val description: String,
    @Json(name = "life_span")val lifeSpan: String,
    val indoor: Int,
    val lap: Int,
    @Json(name = "alt_names")val altNames: String,
    val adaptability: Int,
    @Json(name = "affection_level")val affectionLevel: Int,
    @Json(name = "child_friendly")val childFriendly: Int,
    @Json(name = "dog_friendly")val dogFriendly: Int,
    @Json(name = "energy_level")val energyLevel: Int,
    val grooming: Int,
    @Json(name = "healthIssues") val healthIssues: Int,
    val intelligence: Int,
    @Json(name = "sheddingLevel") val sheddingLevel: Int,
    val social_needs: Int,
    @Json(name = "strangerFriendly") val strangerFriendly: Int,
    val vocalisation: Int,
    val experimental: Int,
    val hairless: Int,
    val natural: Int,
    val rare: Int,
    val rex: Int,
    @Json(name = "suppressed_tail") val suppressedTail: Int,
    @Json(name = "shortLegs") val shortLegs: Int,
    @Json(name = "wikipedia_url")val wikipediaUrl: Int,
    val hypoallergenic: Int,
    @Json(name = "reference_image_id")val referenceImageId: Int,
    val image: Image
)
@JsonClass(generateAdapter = true)
data class Weight (
    val imperial: String,
    val metric: String,
)
@JsonClass(generateAdapter = true)
data class Image (
    val id: String,
    val width: Int,
    val height: Int,
    val url: String,
)
