package com.ryanmichela.sshd;

/**
 * Copyright 2013 Ryan Michela
 */

import jline.console.completer.Completer;


import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;


// This class *may* not be needed.
// If it is needed, the only class that uses it is ConsoleShellFactory on line 96
public class ConsoleCommandCompleter /*implements Completer*/ {

    /*
    public int complete(final String buffer, final int cursor, final List<CharSequence> candidates) {
        Waitable<List<String>> waitable = new Waitable<List<String>>() {
            @Override
            protected List<String> evaluate() {
                CommandMap commandMap = ReflectionUtil.getProtectedValue(Bukkit.getServer(), "commandMap");
                return commandMap.tabComplete(Bukkit.getServer().getConsoleSender(), buffer);
            }
        };
        SshdPlugin.instance.getProxy().getScheduler().runAsync(SshdPlugin.instance, waitable);
        try {
            List<String> offers = waitable.get();
            if (offers == null) {
                return cursor;
            }
            candidates.addAll(offers);

            final int lastSpace = buffer.lastIndexOf(' ');
            if (lastSpace == -1) {
                return cursor - buffer.length();
            } else {
                return cursor - (buffer.length() - lastSpace - 1);
            }
        } catch (ExecutionException e) {
            SshdPlugin.instance.getLogger().log(Level.WARNING, "Unhandled exception when tab completing", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return cursor;
    }
     */
}

