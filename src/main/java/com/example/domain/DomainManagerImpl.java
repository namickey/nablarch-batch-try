package com.example.domain;

import nablarch.core.validation.ee.DomainManager;

/**
 * {@link DomainManagerImpl} の実装クラス。
 * <p>
 * ドメインを定義したBeanクラスを返却する。
 * </p>
 */
public final class DomainManagerImpl
        implements DomainManager<DomainBean> {

    @Override
    public Class<DomainBean> getDomainBean() {
        // ドメインBeanのClassオブジェクトを返す。
        return DomainBean.class;
    }
}
