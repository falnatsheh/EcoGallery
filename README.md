
**THIS PROJECT IS RETIRED** 


EcoGallery
==========

Replacement for Gallery widget in Android with View recycling. This originally made by Joseph Earl ([details](http://stackoverflow.com/a/5882944)). 

## Usage: 

1- Include 'EcoGallery' android library to your project. (Eclipse project: properties -> Android -> Library - Add)

2-  You could declare EcoGallery in the layout xml file, Example:  

    <us.feras.ecogallery.EcoGallery
        android:id="@+id/images"
        android:layout_width="match_parent"
        android:layout_height="60dp" 
        android:layout_alignParentBottom="true" 
        /> 
        
3- Use EcoGalleryAdapterView instead of AdapterView. 

For a complete tutorial check the [wiki](https://github.com/falnatsheh/EcoGallery/wiki/EcoGallery-Sample-Code). 

## Sample App
Click [here](https://github.com/falnatsheh/EcoGallery/tree/master/EcoGallerySample) to view the sample app

## Change Log: 
June 24, 2013 
- Compiler warnings fixed [@mnowrot](https://github.com/mnowrot)

## Limitation: 

>The existing implementation assumed that each different position in the adapter resulted in a unique view. The changes are only good if your Gallery contains only one type of item, if not you'll need to add some sort of key based on item type and the amount of that type required.

## Notes

- If you got `Failed to find style 'ecoGalleryStyle' in current theme` then add an empty style in your AppTheme styles.xml see an example below (thanks to @[hastoukopsaro](https://github.com/hastoukopsaro)): 

```xml
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    <item name="ecoGalleryStyle">@style/ecoGalleryStyle</item>
</style>

<style name="ecoGalleryStyle"> </style>
```

