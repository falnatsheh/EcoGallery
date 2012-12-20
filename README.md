EcoGallery
==========

Replacement for Gallery widget in Android with View recycling. This originally made by Joseph Earl ([details](http://stackoverflow.com/a/5882944)). 

##Usage: 

1- You need to include 'EcoGallery' android library to your project. (Eclipse project: properties -> Android -> Library - Add)

2-  You could declare EcoGallery in the layout xml file, Example:  

    <us.feras.ecogallery.EcoGallery
        android:id="@+id/images"
        android:layout_width="match_parent"
        android:layout_height="60dp" 
        android:layout_alignParentBottom="true" 
        /> 
        
3- You need to use EcoGalleryAdapterView instead of AdapterView. 

##Limitation: 

>The existing implementation assumed that each different position in the adapter resulted in a unique view. The changes above are only good if your Gallery contains only one type of item, if not you'll need to add some sort of key based on item type and the amount of that type required.


