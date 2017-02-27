package com.example.jiangbo.musicplayer.usecase;

/**
 * Created by jiangbo on 2017/2/26.
 *域层的进入点
 * @Param <Q>请求类型</>
 * @Param<P>响应类型</P>
 */

public abstract class UseCase<Q extends UseCase.RequestValues, P extends UseCase.ResponseValue> {
    private Q mRequestValues;

    public Q getRequestValues() {
        return mRequestValues;
    }

    public void setRequestValues(Q requestValues) {
        mRequestValues = requestValues;
    }

    public abstract P excute(Q requestValues);

    /**
     * 传递给请求的数据
      */
    public interface RequestValues {
    }
    /**
     * 从请求接收的数据
     */
    public interface ResponseValue {
    }
}
