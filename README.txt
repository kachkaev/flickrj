FORK DETAILS
========================

There are two minor differences between this version of the library and the original one (v 1.2).

1. Views field support for flickr.photos.search method
------------------------
In spite of the fact that flickrj photo.getViews method is deprecated, flickr.photos.search API call still has “views” as one of the options for “extras” argument. See http://www.flickr.com/services/api/flickr.photos.search.html

Original version of the library does not support putting that value into Photo object, and this issue is fixed in the fork. Methods Photo.getViews and Photo.setViews are left deprecated as other API methods e.g. flickr.photos.getInfo do not return value of views. To get it you have to call flickr.stats.getPhotoStats, but this works only for photos by premium users.

2. Extras.DESCRIPTION added
------------------------
This is to support description in flickr.photos.search results.

Usage example
------------------------
  // Flickr flickr is defiened somewhere before
	PhotosInterface photos = flickr.getPhotosInterface();
	SearchParameters criteria = new SearchParameters();
	HashSet<String> extras = new HashSet<String>();
	extras.add(Extras.GEO);
	extras.add(Extras.VIEWS); // <--
	extras.add(Extras.DESCRIPTION); // <--
	criteria.setExtras(extras);
	criteria.setAccuracy(16);
	criteria.setBBox(-0.1931, 51.4909, -0.0818, 51.5351); // Central London
	PhotoList photoList = photos.search(criteria, 250, 1);



ORIGINAL README
========================
This is a Java API which wraps the REST-based Flickr API
(information available at http://www.flickr.com/services/api/).

This API has been tested with JDK 1.4 and JDK 1.5. The default
distribution is build with JDK 1.5.

Please note: this library is not thread safe.

To use the API just construct a instance of the class
com.aetreion.flickr.Flickr and request the interfaces which you need
to work with.  For example, to send a test ping to the Flickr service:

String apiKey = YOUR_API_KEY
Flickr f = new Flickr(apiKey);
TestInterface testInterface = f.getTestInterface();
Collection results = testInterface.echo(Collections.EMPTY_LIST);

An API key is required to use this API.  You should contact Flickr to
acquire an API key.  More information is available at:
http://www.flickr.com/services/api/

Comments and questions should be sent to anthonyeden@gmail.com.

-Anthony Eden