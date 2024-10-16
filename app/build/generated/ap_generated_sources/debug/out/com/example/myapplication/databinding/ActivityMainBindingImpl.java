package com.example.myapplication.databinding;
import com.example.myapplication.R;
import com.example.myapplication.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvResult, 1);
        sViewsWithIds.put(R.id.buttonGrid, 2);
        sViewsWithIds.put(R.id.buttonClear, 3);
        sViewsWithIds.put(R.id.buttonSign, 4);
        sViewsWithIds.put(R.id.buttonPercent, 5);
        sViewsWithIds.put(R.id.buttonDivide, 6);
        sViewsWithIds.put(R.id.button7, 7);
        sViewsWithIds.put(R.id.button8, 8);
        sViewsWithIds.put(R.id.button9, 9);
        sViewsWithIds.put(R.id.buttonMultiply, 10);
        sViewsWithIds.put(R.id.button4, 11);
        sViewsWithIds.put(R.id.button5, 12);
        sViewsWithIds.put(R.id.button6, 13);
        sViewsWithIds.put(R.id.buttonSubtract, 14);
        sViewsWithIds.put(R.id.button1, 15);
        sViewsWithIds.put(R.id.button2, 16);
        sViewsWithIds.put(R.id.button3, 17);
        sViewsWithIds.put(R.id.buttonAdd, 18);
        sViewsWithIds.put(R.id.button0, 19);
        sViewsWithIds.put(R.id.buttonDecimal, 20);
        sViewsWithIds.put(R.id.buttonEquals, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[20]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[21]
            , (android.widget.GridLayout) bindings[2]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[14]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}