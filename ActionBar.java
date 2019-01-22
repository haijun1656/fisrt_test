/*      */ package android.support.v7.app;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.content.res.Configuration;
/*      */ import android.content.res.TypedArray;
/*      */ import android.graphics.drawable.Drawable;
/*      */ import android.support.annotation.DrawableRes;
/*      */ import android.support.annotation.NonNull;
/*      */ import android.support.annotation.Nullable;
/*      */ import android.support.annotation.RestrictTo;
/*      */ import android.support.annotation.StringRes;
/*      */ import android.support.v4.app.FragmentTransaction;
/*      */ import android.support.v7.appcompat.R.styleable;
/*      */ import android.support.v7.view.ActionMode;
/*      */ import android.support.v7.view.ActionMode.Callback;
/*      */ import android.util.AttributeSet;
/*      */ import android.view.KeyEvent;
/*      */ import android.view.View;
/*      */ import android.view.ViewGroup.LayoutParams;
/*      */ import android.view.ViewGroup.MarginLayoutParams;
/*      */ import android.widget.SpinnerAdapter;
/*      */ import java.lang.annotation.Annotation;
/*      */ import java.lang.annotation.Retention;
/*      */ import java.lang.annotation.RetentionPolicy;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class ActionBar
/*      */ {
/*      */   @Deprecated
/*      */   public static final int NAVIGATION_MODE_STANDARD = 0;
/*      */   @Deprecated
/*      */   public static final int NAVIGATION_MODE_LIST = 1;
/*      */   @Deprecated
/*      */   public static final int NAVIGATION_MODE_TABS = 2;
/*      */   public static final int DISPLAY_USE_LOGO = 1;
/*      */   public static final int DISPLAY_SHOW_HOME = 2;
/*      */   public static final int DISPLAY_HOME_AS_UP = 4;
/*      */   public static final int DISPLAY_SHOW_TITLE = 8;
/*      */   public static final int DISPLAY_SHOW_CUSTOM = 16;
/*      */   
/*      */   public abstract void setCustomView(View paramView);
/*      */   
/*      */   public abstract void setCustomView(View paramView, LayoutParams paramLayoutParams);
/*      */   
/*      */   public abstract void setCustomView(int paramInt);
/*      */   
/*      */   public abstract void setIcon(@DrawableRes int paramInt);
/*      */   
/*      */   public abstract void setIcon(Drawable paramDrawable);
/*      */   
/*      */   public abstract void setLogo(@DrawableRes int paramInt);
/*      */   
/*      */   public abstract void setLogo(Drawable paramDrawable);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void setListNavigationCallbacks(SpinnerAdapter paramSpinnerAdapter, OnNavigationListener paramOnNavigationListener);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void setSelectedNavigationItem(int paramInt);
/*      */   
/*      */   @Deprecated
/*      */   public abstract int getSelectedNavigationIndex();
/*      */   
/*      */   @Deprecated
/*      */   public abstract int getNavigationItemCount();
/*      */   
/*      */   public abstract void setTitle(CharSequence paramCharSequence);
/*      */   
/*      */   public abstract void setTitle(@StringRes int paramInt);
/*      */   
/*      */   public abstract void setSubtitle(CharSequence paramCharSequence);
/*      */   
/*      */   public abstract void setSubtitle(int paramInt);
/*      */   
/*      */   public abstract void setDisplayOptions(int paramInt);
/*      */   
/*      */   public abstract void setDisplayOptions(int paramInt1, int paramInt2);
/*      */   
/*      */   public abstract void setDisplayUseLogoEnabled(boolean paramBoolean);
/*      */   
/*      */   public abstract void setDisplayShowHomeEnabled(boolean paramBoolean);
/*      */   
/*      */   public abstract void setDisplayHomeAsUpEnabled(boolean paramBoolean);
/*      */   
/*      */   public abstract void setDisplayShowTitleEnabled(boolean paramBoolean);
/*      */   
/*      */   public abstract void setDisplayShowCustomEnabled(boolean paramBoolean);
/*      */   
/*      */   public abstract void setBackgroundDrawable(@Nullable Drawable paramDrawable);
/*      */   
/*      */   public void setStackedBackgroundDrawable(Drawable d) {}
/*      */   
/*      */   public void setSplitBackgroundDrawable(Drawable d) {}
/*      */   
/*      */   public abstract View getCustomView();
/*      */   
/*      */   @Nullable
/*      */   public abstract CharSequence getTitle();
/*      */   
/*      */   @Nullable
/*      */   public abstract CharSequence getSubtitle();
/*      */   
/*      */   @Deprecated
/*      */   public abstract int getNavigationMode();
/*      */   
/*      */   @Deprecated
/*      */   public abstract void setNavigationMode(int paramInt);
/*      */   
/*      */   public abstract int getDisplayOptions();
/*      */   
/*      */   @Deprecated
/*      */   public abstract Tab newTab();
/*      */   
/*      */   @Deprecated
/*      */   public abstract void addTab(Tab paramTab);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void addTab(Tab paramTab, boolean paramBoolean);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void addTab(Tab paramTab, int paramInt);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void addTab(Tab paramTab, int paramInt, boolean paramBoolean);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void removeTab(Tab paramTab);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void removeTabAt(int paramInt);
/*      */   
/*      */   @Deprecated
/*      */   public abstract void removeAllTabs();
/*      */   
/*      */   @Deprecated
/*      */   public abstract void selectTab(Tab paramTab);
/*      */   
/*      */   @Deprecated
/*      */   @Nullable
/*      */   public abstract Tab getSelectedTab();
/*      */   
/*      */   @Deprecated
/*      */   public abstract Tab getTabAt(int paramInt);
/*      */   
/*      */   @Deprecated
/*      */   public abstract int getTabCount();
/*      */   
/*      */   public abstract int getHeight();
/*      */   
/*      */   public abstract void show();
/*      */   
/*      */   public abstract void hide();
/*      */   
/*      */   public abstract boolean isShowing();
/*      */   
/*      */   public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener paramOnMenuVisibilityListener);
/*      */   
/*      */   public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener paramOnMenuVisibilityListener);
/*      */   
/*      */   public void setHomeButtonEnabled(boolean enabled) {}
/*      */   
/*      */   public Context getThemedContext()
/*      */   {
/*  858 */     return null;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean isTitleTruncated()
/*      */   {
/*  869 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHomeAsUpIndicator(@Nullable Drawable indicator) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHomeAsUpIndicator(@DrawableRes int resId) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHomeActionContentDescription(@Nullable CharSequence description) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHomeActionContentDescription(@StringRes int resId) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHideOnContentScrollEnabled(boolean hideOnContentScroll)
/*      */   {
/*  965 */     if (hideOnContentScroll) {
/*  966 */       throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean isHideOnContentScrollEnabled()
/*      */   {
/*  979 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public int getHideOffset()
/*      */   {
/*  992 */     return 0;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setHideOffset(int offset)
/*      */   {
/* 1005 */     if (offset != 0) {
/* 1006 */       throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void setElevation(float elevation)
/*      */   {
/* 1020 */     if (elevation != 0.0F) {
/* 1021 */       throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public float getElevation()
/*      */   {
/* 1035 */     return 0.0F;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public void setDefaultDisplayHomeAsUpEnabled(boolean enabled) {}
/*      */   
/*      */ 
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public void setShowHideAnimationEnabled(boolean enabled) {}
/*      */   
/*      */ 
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public void onConfigurationChanged(Configuration config) {}
/*      */   
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public void dispatchMenuVisibilityChanged(boolean visible) {}
/*      */   
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public ActionMode startActionMode(ActionMode.Callback callback)
/*      */   {
/* 1061 */     return null;
/*      */   }
/*      */   
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean openOptionsMenu()
/*      */   {
/* 1067 */     return false;
/*      */   }
/*      */   
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean closeOptionsMenu()
/*      */   {
/* 1073 */     return false;
/*      */   }
/*      */   
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean invalidateOptionsMenu()
/*      */   {
/* 1079 */     return false;
/*      */   }
/*      */   
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean onMenuKeyEvent(KeyEvent event)
/*      */   {
/* 1085 */     return false;
/*      */   }
/*      */   
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean onKeyShortcut(int keyCode, KeyEvent ev)
/*      */   {
/* 1091 */     return false;
/*      */   }
/*      */   
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public boolean collapseActionView()
/*      */   {
/* 1097 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public void setWindowTitle(CharSequence title) {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   boolean requestFocus()
/*      */   {
/* 1113 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   void onDestroy() {}
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public static class LayoutParams
/*      */     extends ViewGroup.MarginLayoutParams
/*      */   {
/* 1373 */     public int gravity = 0;
/*      */     
/*      */     public LayoutParams(@NonNull Context c, AttributeSet attrs) {
/* 1376 */       super(attrs);
/*      */       
/* 1378 */       TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.ActionBarLayout);
/* 1379 */       this.gravity = a.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
/* 1380 */       a.recycle();
/*      */     }
/*      */     
/*      */     public LayoutParams(int width, int height) {
/* 1384 */       super(height);
/* 1385 */       this.gravity = 8388627;
/*      */     }
/*      */     
/*      */     public LayoutParams(int width, int height, int gravity) {
/* 1389 */       super(height);
/* 1390 */       this.gravity = gravity;
/*      */     }
/*      */     
/*      */     public LayoutParams(int gravity) {
/* 1394 */       this(-2, -1, gravity);
/*      */     }
/*      */     
/*      */     public LayoutParams(LayoutParams source) {
/* 1398 */       super();
/*      */       
/* 1400 */       this.gravity = source.gravity;
/*      */     }
/*      */     
/*      */     public LayoutParams(ViewGroup.LayoutParams source) {
/* 1404 */       super();
/*      */     }
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static abstract interface TabListener
/*      */   {
/*      */     public abstract void onTabSelected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*      */     
/*      */     public abstract void onTabUnselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*      */     
/*      */     public abstract void onTabReselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static abstract class Tab
/*      */   {
/*      */     public static final int INVALID_POSITION = -1;
/*      */     
/*      */     public abstract int getPosition();
/*      */     
/*      */     public abstract Drawable getIcon();
/*      */     
/*      */     public abstract CharSequence getText();
/*      */     
/*      */     public abstract Tab setIcon(Drawable paramDrawable);
/*      */     
/*      */     public abstract Tab setIcon(@DrawableRes int paramInt);
/*      */     
/*      */     public abstract Tab setText(CharSequence paramCharSequence);
/*      */     
/*      */     public abstract Tab setText(int paramInt);
/*      */     
/*      */     public abstract Tab setCustomView(View paramView);
/*      */     
/*      */     public abstract Tab setCustomView(int paramInt);
/*      */     
/*      */     public abstract View getCustomView();
/*      */     
/*      */     public abstract Tab setTag(Object paramObject);
/*      */     
/*      */     public abstract Object getTag();
/*      */     
/*      */     public abstract Tab setTabListener(ActionBar.TabListener paramTabListener);
/*      */     
/*      */     public abstract void select();
/*      */     
/*      */     public abstract Tab setContentDescription(@StringRes int paramInt);
/*      */     
/*      */     public abstract Tab setContentDescription(CharSequence paramCharSequence);
/*      */     
/*      */     public abstract CharSequence getContentDescription();
/*      */   }
/*      */   
/*      */   public static abstract interface OnMenuVisibilityListener
/*      */   {
/*      */     public abstract void onMenuVisibilityChanged(boolean paramBoolean);
/*      */   }
/*      */   
/*      */   @Deprecated
/*      */   public static abstract interface OnNavigationListener
/*      */   {
/*      */     public abstract boolean onNavigationItemSelected(int paramInt, long paramLong);
/*      */   }
/*      */   
/*      */   @Retention(RetentionPolicy.SOURCE)
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public static @interface DisplayOptions {}
/*      */   
/*      */   @Retention(RetentionPolicy.SOURCE)
/*      */   @RestrictTo({android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/*      */   public static @interface NavigationMode {}
/*      */ }


/* Location:              D:\MyData\panhj1\Downloads\appcompat-v7-27.1.1\classes.jar!\android\support\v7\app\ActionBar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */