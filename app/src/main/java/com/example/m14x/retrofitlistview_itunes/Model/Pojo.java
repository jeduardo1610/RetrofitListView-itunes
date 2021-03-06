package com.example.m14x.retrofitlistview_itunes.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by m14x on 04/18/2016.
 */

public class Pojo implements Parcelable{

    @Override
    public String toString() {
        return "Pojo{" +
                "wrapperType='" + wrapperType + '\'' +
                ", kind='" + kind + '\'' +
                ", artistId=" + artistId +
                ", collectionId=" + collectionId +
                ", trackId=" + trackId +
                ", artistName='" + artistName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                ", trackName='" + trackName + '\'' +
                ", collectionCensoredName='" + collectionCensoredName + '\'' +
                ", trackCensoredName='" + trackCensoredName + '\'' +
                ", artistViewUrl='" + artistViewUrl + '\'' +
                ", collectionViewUrl='" + collectionViewUrl + '\'' +
                ", trackViewUrl='" + trackViewUrl + '\'' +
                ", previewUrl='" + previewUrl + '\'' +
                ", artworkUrl30='" + artworkUrl30 + '\'' +
                ", artworkUrl60='" + artworkUrl60 + '\'' +
                ", artworkUrl100='" + artworkUrl100 + '\'' +
                ", collectionPrice=" + collectionPrice +
                ", trackPrice=" + trackPrice +
                ", releaseDate='" + releaseDate + '\'' +
                ", collectionExplicitness='" + collectionExplicitness + '\'' +
                ", trackExplicitness='" + trackExplicitness + '\'' +
                ", discCount=" + discCount +
                ", discNumber=" + discNumber +
                ", trackCount=" + trackCount +
                ", trackNumber=" + trackNumber +
                ", trackTimeMillis=" + trackTimeMillis +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", primaryGenreName='" + primaryGenreName + '\'' +
                ", isStreamable=" + isStreamable +
                ", contentAdvisoryRating='" + contentAdvisoryRating + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    private String wrapperType;
    private String kind;
    private Integer artistId;
    private Integer collectionId;
    private Integer trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private Double collectionPrice;
    private Double trackPrice;
    private String releaseDate;
    private String collectionExplicitness;
    private String trackExplicitness;
    private Integer discCount;
    private Integer discNumber;
    private Integer trackCount;
    private Integer trackNumber;
    private Integer trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
    private Boolean isStreamable;
    private String contentAdvisoryRating;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    protected Pojo(Parcel in) {
        wrapperType = in.readString();
        kind = in.readString();
        artistName = in.readString();
        collectionName = in.readString();
        trackName = in.readString();
        collectionCensoredName = in.readString();
        trackCensoredName = in.readString();
        artistViewUrl = in.readString();
        collectionViewUrl = in.readString();
        trackViewUrl = in.readString();
        previewUrl = in.readString();
        artworkUrl30 = in.readString();
        artworkUrl60 = in.readString();
        artworkUrl100 = in.readString();
        releaseDate = in.readString();
        collectionExplicitness = in.readString();
        trackExplicitness = in.readString();
        country = in.readString();
        currency = in.readString();
        primaryGenreName = in.readString();
        contentAdvisoryRating = in.readString();
    }

    public static final Creator<Pojo> CREATOR = new Creator<Pojo>() {
        @Override
        public Pojo createFromParcel(Parcel in) {
            return new Pojo(in);
        }

        @Override
        public Pojo[] newArray(int size) {
            return new Pojo[size];
        }
    };

    /**
     *
     * @return
     * The wrapperType
     */
    public String getWrapperType() {
        return wrapperType;
    }

    /**
     *
     * @param wrapperType
     * The wrapperType
     */
    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    /**
     *
     * @return
     * The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     * The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     * The artistId
     */
    public Integer getArtistId() {
        return artistId;
    }

    /**
     *
     * @param artistId
     * The artistId
     */
    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    /**
     *
     * @return
     * The collectionId
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     *
     * @param collectionId
     * The collectionId
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     *
     * @return
     * The trackId
     */
    public Integer getTrackId() {
        return trackId;
    }

    /**
     *
     * @param trackId
     * The trackId
     */
    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    /**
     *
     * @return
     * The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     *
     * @param artistName
     * The artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     *
     * @return
     * The collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     *
     * @param collectionName
     * The collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     *
     * @return
     * The trackName
     */
    public String getTrackName() {
        return trackName;
    }

    /**
     *
     * @param trackName
     * The trackName
     */
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    /**
     *
     * @return
     * The collectionCensoredName
     */
    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    /**
     *
     * @param collectionCensoredName
     * The collectionCensoredName
     */
    public void setCollectionCensoredName(String collectionCensoredName) {
        this.collectionCensoredName = collectionCensoredName;
    }

    /**
     *
     * @return
     * The trackCensoredName
     */
    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    /**
     *
     * @param trackCensoredName
     * The trackCensoredName
     */
    public void setTrackCensoredName(String trackCensoredName) {
        this.trackCensoredName = trackCensoredName;
    }

    /**
     *
     * @return
     * The artistViewUrl
     */
    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    /**
     *
     * @param artistViewUrl
     * The artistViewUrl
     */
    public void setArtistViewUrl(String artistViewUrl) {
        this.artistViewUrl = artistViewUrl;
    }

    /**
     *
     * @return
     * The collectionViewUrl
     */
    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }

    /**
     *
     * @param collectionViewUrl
     * The collectionViewUrl
     */
    public void setCollectionViewUrl(String collectionViewUrl) {
        this.collectionViewUrl = collectionViewUrl;
    }

    /**
     *
     * @return
     * The trackViewUrl
     */
    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    /**
     *
     * @param trackViewUrl
     * The trackViewUrl
     */
    public void setTrackViewUrl(String trackViewUrl) {
        this.trackViewUrl = trackViewUrl;
    }

    /**
     *
     * @return
     * The previewUrl
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     *
     * @param previewUrl
     * The previewUrl
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     *
     * @return
     * The artworkUrl30
     */
    public String getArtworkUrl30() {
        return artworkUrl30;
    }

    /**
     *
     * @param artworkUrl30
     * The artworkUrl30
     */
    public void setArtworkUrl30(String artworkUrl30) {
        this.artworkUrl30 = artworkUrl30;
    }

    /**
     *
     * @return
     * The artworkUrl60
     */
    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    /**
     *
     * @param artworkUrl60
     * The artworkUrl60
     */
    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    /**
     *
     * @return
     * The artworkUrl100
     */
    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    /**
     *
     * @param artworkUrl100
     * The artworkUrl100
     */
    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    /**
     *
     * @return
     * The collectionPrice
     */
    public Double getCollectionPrice() {
        return collectionPrice;
    }

    /**
     *
     * @param collectionPrice
     * The collectionPrice
     */
    public void setCollectionPrice(Double collectionPrice) {
        this.collectionPrice = collectionPrice;
    }

    /**
     *
     * @return
     * The trackPrice
     */
    public Double getTrackPrice() {
        return trackPrice;
    }

    /**
     *
     * @param trackPrice
     * The trackPrice
     */
    public void setTrackPrice(Double trackPrice) {
        this.trackPrice = trackPrice;
    }

    /**
     *
     * @return
     * The releaseDate
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     *
     * @param releaseDate
     * The releaseDate
     */
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     *
     * @return
     * The collectionExplicitness
     */
    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    /**
     *
     * @param collectionExplicitness
     * The collectionExplicitness
     */
    public void setCollectionExplicitness(String collectionExplicitness) {
        this.collectionExplicitness = collectionExplicitness;
    }

    /**
     *
     * @return
     * The trackExplicitness
     */
    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    /**
     *
     * @param trackExplicitness
     * The trackExplicitness
     */
    public void setTrackExplicitness(String trackExplicitness) {
        this.trackExplicitness = trackExplicitness;
    }

    /**
     *
     * @return
     * The discCount
     */
    public Integer getDiscCount() {
        return discCount;
    }

    /**
     *
     * @param discCount
     * The discCount
     */
    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

    /**
     *
     * @return
     * The discNumber
     */
    public Integer getDiscNumber() {
        return discNumber;
    }

    /**
     *
     * @param discNumber
     * The discNumber
     */
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    /**
     *
     * @return
     * The trackCount
     */
    public Integer getTrackCount() {
        return trackCount;
    }

    /**
     *
     * @param trackCount
     * The trackCount
     */
    public void setTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
    }

    /**
     *
     * @return
     * The trackNumber
     */
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     *
     * @param trackNumber
     * The trackNumber
     */
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     *
     * @return
     * The trackTimeMillis
     */
    public Integer getTrackTimeMillis() {
        return trackTimeMillis;
    }

    /**
     *
     * @param trackTimeMillis
     * The trackTimeMillis
     */
    public void setTrackTimeMillis(Integer trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The primaryGenreName
     */
    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    /**
     *
     * @param primaryGenreName
     * The primaryGenreName
     */
    public void setPrimaryGenreName(String primaryGenreName) {
        this.primaryGenreName = primaryGenreName;
    }

    /**
     *
     * @return
     * The isStreamable
     */
    public Boolean getIsStreamable() {
        return isStreamable;
    }

    /**
     *
     * @param isStreamable
     * The isStreamable
     */
    public void setIsStreamable(Boolean isStreamable) {
        this.isStreamable = isStreamable;
    }

    /**
     *
     * @return
     * The contentAdvisoryRating
     */
    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    /**
     *
     * @param contentAdvisoryRating
     * The contentAdvisoryRating
     */
    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(wrapperType);
        dest.writeString(kind);
        dest.writeString(artistName);
        dest.writeString(collectionName);
        dest.writeString(trackName);
        dest.writeString(collectionCensoredName);
        dest.writeString(trackCensoredName);
        dest.writeString(artistViewUrl);
        dest.writeString(collectionViewUrl);
        dest.writeString(trackViewUrl);
        dest.writeString(previewUrl);
        dest.writeString(artworkUrl30);
        dest.writeString(artworkUrl60);
        dest.writeString(artworkUrl100);
        dest.writeString(releaseDate);
        dest.writeString(collectionExplicitness);
        dest.writeString(trackExplicitness);
        dest.writeString(country);
        dest.writeString(currency);
        dest.writeString(primaryGenreName);
        dest.writeString(contentAdvisoryRating);
    }
}

