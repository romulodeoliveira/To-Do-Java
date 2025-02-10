package com.domain.shared.valueobjetcts;

import com.domain.shared.utils.ValidationResult;
import com.domain.shared.utils.ValidatorUtil;

public abstract class ValueObject {
    public ValidationResult validate() {
        return ValidatorUtil.validate(this);
    }
}
