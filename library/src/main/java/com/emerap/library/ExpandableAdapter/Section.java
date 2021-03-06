package com.emerap.library.ExpandableAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Section.
 * Created by karbunkul on 27.01.2017.
 */

@SuppressWarnings("WeakerAccess")
abstract public class Section<O> implements SectionInterface<O> {

    private String mTitle;
    private String mSectionId;
    private O mObject;
    private Boolean mExpanded = false;
    private List<ItemInterface> mItems = new ArrayList<>();

    @SuppressWarnings("unused")
    public Section(String title, O object) {
        this(title, title.replaceAll(" ", "_").toLowerCase(), object);
    }

    public Section(String title, String sectionId, O object){
        mTitle = title;
        mObject =  object;
        mSectionId = sectionId;
    }

    @Override
    public List<ItemInterface> getItems() {
        return mItems;
    }

    @Override
    public String getSectionId() {
        return mSectionId;
    }

    public void addItem(ItemInterface item){
        mItems.add(item);
    }

    public String getTitle() {
        return mTitle;
    }

    public O getObject() {
        return mObject;
    }

    public Boolean isExpanded() {
        return mExpanded;
    }

    public void setExpanded(Boolean expanded) {
        mExpanded = expanded;
    }

    public int getItemsCount() {
        return mItems.size();
    }

    public ItemInterface getItem(int index) {
        return mItems.get(index);
    }


}
