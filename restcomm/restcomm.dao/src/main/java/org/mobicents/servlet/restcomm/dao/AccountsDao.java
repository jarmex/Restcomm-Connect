/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2014, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */
package org.mobicents.servlet.restcomm.dao;

import java.util.List;

import org.mobicents.servlet.restcomm.entities.Account;
import org.mobicents.servlet.restcomm.entities.Sid;

/**
 * @author quintana.thomas@gmail.com (Thomas Quintana)
 */
public interface AccountsDao {
    void addAccount(Account account);

    Account getAccount(Sid sid);

    Account getAccount(String name);

    /**
     * Created to separate the method used to authenticate from
     * the method used to obtain an account from the database, using a ordinary
     * String parameter.
     * Once authentication cannot allow friendly name as username, this
     * method can be similar to getAccount(String name), but without
     * 'getAccountByFriendlyName' selector.
     * @param name
     * @return Account to authenticate
     */
    Account getAccountToAuthenticate(String name);

    List<Account> getAccounts(Sid sid);

    void removeAccount(Sid sid);

    void updateAccount(Account account);
}
